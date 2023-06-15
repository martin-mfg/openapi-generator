# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.example_response import ExampleResponse


async def test_dummy(client):
    """Test case for dummy

    
    """
    headers = { 
        'Accept': '*/*',
    }
    response = await client.request(
        method='GET',
        path='/example/someMethod',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

