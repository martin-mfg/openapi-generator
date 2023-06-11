import connexion
import six

from app.openapi_server.models.example_response import ExampleResponse  # noqa: E501
from openapi_server import util


def retrieve_something():  # noqa: E501
    """retrieve_something

    get some object # noqa: E501


    :rtype: ExampleResponse
    """
    return 'do some magic!'
