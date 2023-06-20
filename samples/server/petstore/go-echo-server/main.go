package main

import (
	"gitlab.com/openapitools/petstore/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

    //todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// Dummy - 
	e.GET("/example/someMethod", c.Dummy)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}