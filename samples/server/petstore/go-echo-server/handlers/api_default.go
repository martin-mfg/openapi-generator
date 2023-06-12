package handlers
import (
    "gitlab.com/openapitools/petstore/models"
    "github.com/labstack/echo/v4"
    "net/http"
)

// ExampleSomeMethodGet - 
func (c *Container) ExampleSomeMethodGet(ctx echo.Context) error {
    return ctx.JSON(http.StatusOK, models.HelloWorld {
        Message: "Hello World",
    })
}
