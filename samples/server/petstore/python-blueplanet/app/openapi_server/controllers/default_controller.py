import connexion
import six

from app.openapi_server.models.example_response import ExampleResponse  # noqa: E501
from openapi_server import util


def example_some_method_get():  # noqa: E501
    """example_some_method_get

     # noqa: E501


    :rtype: ExampleResponse
    """
    return 'do some magic!'
