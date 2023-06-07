import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def retrieve_something():  # noqa: E501
    """retrieve_something

    get some object # noqa: E501


    :rtype: Union[List[float], Tuple[List[float], int], Tuple[List[float], int, Dict[str, str]]
    """
    return 'do some magic!'
