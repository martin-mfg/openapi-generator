from typing import List, Dict
from aiohttp import web

from openapi_server.models.dummy200_response import Dummy200Response
from openapi_server import util


async def dummy(request: web.Request, ) -> web.Response:
    """dummy

    dummy


    """
    return web.Response(status=200)
