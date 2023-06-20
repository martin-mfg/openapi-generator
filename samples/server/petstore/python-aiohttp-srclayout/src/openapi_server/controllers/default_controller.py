from typing import List, Dict
from aiohttp import web

from openapi_server.models.example_response import ExampleResponse
from openapi_server import util


async def dummy(request: web.Request, ) -> web.Response:
    """dummy

    dummy


    """
    return web.Response(status=200)
