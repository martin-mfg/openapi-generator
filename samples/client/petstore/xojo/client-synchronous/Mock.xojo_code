#tag Class
Public Class Mock
	#tag Method, Flags = &h0
		Sub testDefaultApi(basePath As String)
		  Dim error As New XojoOpenAPIClientSynchronous.XojoOpenAPIClientSynchronousException(0, "No Error")
		  Dim tmpDownloadFile As FolderItem = GetTemporaryFolderItem
		  
		  Dim api As New XojoOpenAPIClientSynchronous.APIs.DefaultApi
		  api.BasePath = basePath
		  api.BasicAuthUser = "user"
		  api.BasicAuthPassword = "password"
		  api.UseHTTPS = false
		  
		  
		  // Operation dummy
		  // - parameter localOutStatus: Information on whether the operation succeeded.
		  // - parameter localOutData: On success, contains the data returned by the API.
		  //
		  // - GET /example/someMethod
		  // - dummy
		  // - defaultResponse: Nil
		  //
		  //
		  Dim DummyData As XojoOpenAPIClientSynchronous.Models.Dummy200Response
		  If api.Dummy(error, DummyData) Then
		    Print("[+] DefaultApi.Dummy successful.")
		  Else
		    Print("[-] DefaultApi.Dummy unsuccessful.")
			Print("    " + " | ErrorNumber: " + Str(error.ErrorNumber) + " | HTTP Status: " + Str(error.HTTPCode) + " | SocketCode: " + Str(error.SocketCode) + " | Message: " + error.Message)
		  End If
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Function FromRFC3339(stringRepresentation As String) As Date

		  Dim d As New Xoson.DateIntermediate(stringRepresentation)

		  return New Date(d.year, d.month, d.day, d.hour, d.minute, d.second, 0.0)
		End Function
	#tag EndMethod


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="useHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
