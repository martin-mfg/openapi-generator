# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.example_response import ExampleResponse  # noqa: F401


def test_example_some_method_get(client: TestClient):
    """Test case for example_some_method_get

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/example/someMethod",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

