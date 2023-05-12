import typing_extensions

from petstore_api.paths import PathValues
from petstore_api.apis.paths.foo import Foo

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.FOO: Foo,
    }
)

path_to_api = PathToApi(
    {
        PathValues.FOO: Foo,
    }
)
