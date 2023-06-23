#' Create a new Dummy200Response
#'
#' @description
#' Dummy200Response Class
#'
#' @docType class
#' @title Dummy200Response
#' @description Dummy200Response Class
#' @format An \code{R6Class} generator object
#' @field outerProp  \link{Dummy200ResponseOuterProp} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Dummy200Response <- R6::R6Class(
  "Dummy200Response",
  public = list(
    `outerProp` = NULL,
    #' Initialize a new Dummy200Response class.
    #'
    #' @description
    #' Initialize a new Dummy200Response class.
    #'
    #' @param outerProp outerProp
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`outerProp` = NULL, ...) {
      if (!is.null(`outerProp`)) {
        stopifnot(R6::is.R6(`outerProp`))
        self$`outerProp` <- `outerProp`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Dummy200Response in JSON format
    #' @export
    toJSON = function() {
      Dummy200ResponseObject <- list()
      if (!is.null(self$`outerProp`)) {
        Dummy200ResponseObject[["outerProp"]] <-
          self$`outerProp`$toJSON()
      }
      Dummy200ResponseObject
    },
    #' Deserialize JSON string into an instance of Dummy200Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of Dummy200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Dummy200Response
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`outerProp`)) {
        `outerprop_object` <- Dummy200ResponseOuterProp$new()
        `outerprop_object`$fromJSON(jsonlite::toJSON(this_object$`outerProp`, auto_unbox = TRUE, digits = NA))
        self$`outerProp` <- `outerprop_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Dummy200Response in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`outerProp`)) {
          sprintf(
          '"outerProp":
          %s
          ',
          jsonlite::toJSON(self$`outerProp`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Dummy200Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of Dummy200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Dummy200Response
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`outerProp` <- Dummy200ResponseOuterProp$new()$fromJSON(jsonlite::toJSON(this_object$`outerProp`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Dummy200Response
    #'
    #' @description
    #' Validate JSON input with respect to Dummy200Response and throw an exception if invalid
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
    #' @return String representation of Dummy200Response
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
# Dummy200Response$unlock()
#
## Below is an example to define the print function
# Dummy200Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Dummy200Response$lock()

