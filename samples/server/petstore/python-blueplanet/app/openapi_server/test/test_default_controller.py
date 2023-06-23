# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.dummy200_response import Dummy200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_dummy(self):
        """Test case for dummy

        
        """
        response = self.client.open(
            '/example/someMethod',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
