# coding: utf-8

import pytest
import json
from aiohttp import web



async def test_retrieve_something(client):
    """Test case for retrieve_something

    
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/example/someMethod',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

