#' Create a new ExampleResponse
#'
#' @description
#' ExampleResponse Class
#'
#' @docType class
#' @title ExampleResponse
#' @description ExampleResponse Class
#' @format An \code{R6Class} generator object
#' @field myOnlyProperty  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ExampleResponse <- R6::R6Class(
  "ExampleResponse",
  public = list(
    `myOnlyProperty` = NULL,
    #' Initialize a new ExampleResponse class.
    #'
    #' @description
    #' Initialize a new ExampleResponse class.
    #'
    #' @param myOnlyProperty myOnlyProperty
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`myOnlyProperty` = NULL, ...) {
      if (!is.null(`myOnlyProperty`)) {
        stopifnot(is.vector(`myOnlyProperty`), length(`myOnlyProperty`) != 0)
        sapply(`myOnlyProperty`, function(x) stopifnot(is.character(x)))
        self$`myOnlyProperty` <- `myOnlyProperty`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ExampleResponse in JSON format
    #' @export
    toJSON = function() {
      ExampleResponseObject <- list()
      if (!is.null(self$`myOnlyProperty`)) {
        ExampleResponseObject[["myOnlyProperty"]] <-
          self$`myOnlyProperty`
      }
      ExampleResponseObject
    },
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ExampleResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`myOnlyProperty`)) {
        self$`myOnlyProperty` <- ApiClient$new()$deserializeObj(this_object$`myOnlyProperty`, "array[character]", loadNamespace("petstore"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ExampleResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`myOnlyProperty`)) {
          sprintf(
          '"myOnlyProperty":
             [%s]
          ',
          paste(unlist(lapply(self$`myOnlyProperty`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ExampleResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`myOnlyProperty` <- ApiClient$new()$deserializeObj(this_object$`myOnlyProperty`, "array[character]", loadNamespace("petstore"))
      self
    },
    #' Validate JSON input with respect to ExampleResponse
    #'
    #' @description
    #' Validate JSON input with respect to ExampleResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ExampleResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ExampleResponse$unlock()
#
## Below is an example to define the print function
# ExampleResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ExampleResponse$lock()

