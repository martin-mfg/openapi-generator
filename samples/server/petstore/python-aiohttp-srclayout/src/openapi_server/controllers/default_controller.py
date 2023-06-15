from typing import List, Dict
from aiohttp import web

from openapi_server.models.example_response import ExampleResponse
from openapi_server import util


async def example_some_method_get(request: web.Request, ) -> web.Response:
    """example_some_method_get

    


    """
    return web.Response(status=200)
