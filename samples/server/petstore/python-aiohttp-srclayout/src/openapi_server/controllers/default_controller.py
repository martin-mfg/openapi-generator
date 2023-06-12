from typing import List, Dict
from aiohttp import web

from openapi_server import util


async def retrieve_something(request: web.Request, ) -> web.Response:
    """retrieve_something

    get some object


    """
    return web.Response(status=200)
