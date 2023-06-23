#' Create a new Dummy200ResponseOuterPropInnerProp
#'
#' @description
#' Dummy200ResponseOuterPropInnerProp Class
#'
#' @docType class
#' @title Dummy200ResponseOuterPropInnerProp
#' @description Dummy200ResponseOuterPropInnerProp Class
#' @format An \code{R6Class} generator object
#' @field myBool  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Dummy200ResponseOuterPropInnerProp <- R6::R6Class(
  "Dummy200ResponseOuterPropInnerProp",
  public = list(
    `myBool` = NULL,
    #' Initialize a new Dummy200ResponseOuterPropInnerProp class.
    #'
    #' @description
    #' Initialize a new Dummy200ResponseOuterPropInnerProp class.
    #'
    #' @param myBool myBool
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`myBool` = NULL, ...) {
      if (!is.null(`myBool`)) {
        if (!(is.logical(`myBool`) && length(`myBool`) == 1)) {
          stop(paste("Error! Invalid data for `myBool`. Must be a boolean:", `myBool`))
        }
        self$`myBool` <- `myBool`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Dummy200ResponseOuterPropInnerProp in JSON format
    #' @export
    toJSON = function() {
      Dummy200ResponseOuterPropInnerPropObject <- list()
      if (!is.null(self$`myBool`)) {
        Dummy200ResponseOuterPropInnerPropObject[["myBool"]] <-
          self$`myBool`
      }
      Dummy200ResponseOuterPropInnerPropObject
    },
    #' Deserialize JSON string into an instance of Dummy200ResponseOuterPropInnerProp
    #'
    #' @description
    #' Deserialize JSON string into an instance of Dummy200ResponseOuterPropInnerProp
    #'
    #' @param input_json the JSON input
    #' @return the instance of Dummy200ResponseOuterPropInnerProp
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`myBool`)) {
        self$`myBool` <- this_object$`myBool`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Dummy200ResponseOuterPropInnerProp in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`myBool`)) {
          sprintf(
          '"myBool":
            %s
                    ',
          tolower(self$`myBool`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Dummy200ResponseOuterPropInnerProp
    #'
    #' @description
    #' Deserialize JSON string into an instance of Dummy200ResponseOuterPropInnerProp
    #'
    #' @param input_json the JSON input
    #' @return the instance of Dummy200ResponseOuterPropInnerProp
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`myBool` <- this_object$`myBool`
      self
    },
    #' Validate JSON input with respect to Dummy200ResponseOuterPropInnerProp
    #'
    #' @description
    #' Validate JSON input with respect to Dummy200ResponseOuterPropInnerProp and throw an exception if invalid
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
    #' @return String representation of Dummy200ResponseOuterPropInnerProp
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
# Dummy200ResponseOuterPropInnerProp$unlock()
#
## Below is an example to define the print function
# Dummy200ResponseOuterPropInnerProp$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Dummy200ResponseOuterPropInnerProp$lock()

