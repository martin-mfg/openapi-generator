# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.example_response import ExampleResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_example_some_method_get(self):
        """Test case for example_some_method_get

        
        """
        headers = { 
            'Accept': '/',
        }
        response = self.client.open(
            '/example/someMethod',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
