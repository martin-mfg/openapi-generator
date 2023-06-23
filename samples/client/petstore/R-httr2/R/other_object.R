#' Create a new OtherObject
#'
#' @description
#' dummy
#'
#' @docType class
#' @title OtherObject
#' @description OtherObject Class
#' @format An \code{R6Class} generator object
#' @field myOnlyProperty2  \link{ExampleResponse} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OtherObject <- R6::R6Class(
  "OtherObject",
  public = list(
    `myOnlyProperty2` = NULL,
    #' Initialize a new OtherObject class.
    #'
    #' @description
    #' Initialize a new OtherObject class.
    #'
    #' @param myOnlyProperty2 myOnlyProperty2
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`myOnlyProperty2` = NULL, ...) {
      if (!is.null(`myOnlyProperty2`)) {
        stopifnot(R6::is.R6(`myOnlyProperty2`))
        self$`myOnlyProperty2` <- `myOnlyProperty2`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OtherObject in JSON format
    #' @export
    toJSON = function() {
      OtherObjectObject <- list()
      if (!is.null(self$`myOnlyProperty2`)) {
        OtherObjectObject[["myOnlyProperty2"]] <-
          self$`myOnlyProperty2`$toJSON()
      }
      OtherObjectObject
    },
    #' Deserialize JSON string into an instance of OtherObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of OtherObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of OtherObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`myOnlyProperty2`)) {
        `myonlyproperty2_object` <- ExampleResponse$new()
        `myonlyproperty2_object`$fromJSON(jsonlite::toJSON(this_object$`myOnlyProperty2`, auto_unbox = TRUE, digits = NA))
        self$`myOnlyProperty2` <- `myonlyproperty2_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OtherObject in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`myOnlyProperty2`)) {
          sprintf(
          '"myOnlyProperty2":
          %s
          ',
          jsonlite::toJSON(self$`myOnlyProperty2`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OtherObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of OtherObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of OtherObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`myOnlyProperty2` <- ExampleResponse$new()$fromJSON(jsonlite::toJSON(this_object$`myOnlyProperty2`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to OtherObject
    #'
    #' @description
    #' Validate JSON input with respect to OtherObject and throw an exception if invalid
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
    #' @return String representation of OtherObject
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
# OtherObject$unlock()
#
## Below is an example to define the print function
# OtherObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OtherObject$lock()

