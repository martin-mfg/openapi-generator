import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.example_response import ExampleResponse  # noqa: E501
from openapi_server import util


def retrieve_something():  # noqa: E501
    """retrieve_something

    get some object # noqa: E501


    :rtype: Union[ExampleResponse, Tuple[ExampleResponse, int], Tuple[ExampleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
