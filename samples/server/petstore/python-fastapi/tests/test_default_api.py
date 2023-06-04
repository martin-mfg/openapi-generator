# coding: utf-8

from fastapi.testclient import TestClient




def test_retrieve_something(client: TestClient):
    """Test case for retrieve_something

    
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

