# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.dummy200_response import Dummy200Response
from openapi_server.models.example_response import ExampleResponse


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/example/someMethod",
    responses={
        201: {"model": ExampleResponse, "description": "dummy"},
        200: {"model": Dummy200Response, "description": "dummy"},
    },
    tags=["default"],
    response_model_by_alias=True,
)
async def dummy(
) -> Dummy200Response:
    """dummy"""
    return BaseDefaultApi.subclasses[0]().dummy()
