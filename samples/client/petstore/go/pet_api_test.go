package main

import (
	"os"
	"testing"

	sw "github.com/OpenAPITools/openapi-generator/samples/client/petstore/go/go-petstore"
)

var client *sw.APIClient

const testHost = "petstore.swagger.io:80"
const testScheme = "http"

func TestMain(m *testing.M) {
	cfg := sw.NewConfiguration()
	cfg.AddDefaultHeader("testheader", "testvalue")
	cfg.Host = testHost
	cfg.Scheme = testScheme
	client = sw.NewAPIClient(cfg)
	retCode := m.Run()
	os.Exit(retCode)
}
