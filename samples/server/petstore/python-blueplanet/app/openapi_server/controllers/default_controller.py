import connexion
import six

from app.openapi_server.models.example_response import ExampleResponse  # noqa: E501
from app.openapi_server.models.node import Node  # noqa: E501
from openapi_server import util


def dummy():  # noqa: E501
    """dummy

    dummy # noqa: E501


    :rtype: ExampleResponse
    """
    return 'do some magic!'
