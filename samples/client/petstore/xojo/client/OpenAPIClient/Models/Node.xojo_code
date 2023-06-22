#tag Class
Protected Class Node

	#tag Property, Flags = &h0
		left As OpenAPIClient.Models.Node
	#tag EndProperty


	#tag Property, Flags = &h0
		right As OpenAPIClient.Models.Node
	#tag EndProperty





	#tag ViewBehavior
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
			Name="left"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Node"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="right"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Node"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


