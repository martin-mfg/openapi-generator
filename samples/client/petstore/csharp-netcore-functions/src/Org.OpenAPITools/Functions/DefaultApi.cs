using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class DefaultApi
    { 
        [FunctionName("DefaultApi_RetrieveSomething")]
        public async Task<ActionResult<ExampleResponse>> _RetrieveSomething([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "example/someMethod")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("RetrieveSomething");
            if(method == null)
            {
                return new StatusCodeResult((int)HttpStatusCode.NotImplemented);
            }
            return (await ((Task<ExampleResponse>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false));
        }
    }
}
