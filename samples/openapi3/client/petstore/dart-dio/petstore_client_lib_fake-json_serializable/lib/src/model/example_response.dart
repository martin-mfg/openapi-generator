//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/other_object.dart';
import 'package:json_annotation/json_annotation.dart';

part 'example_response.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class ExampleResponse {
  /// Returns a new [ExampleResponse] instance.
  ExampleResponse({

     this.myOnlyProperty,
  });

  @JsonKey(
    
    name: r'myOnlyProperty',
    required: false,
    includeIfNull: false
  )


  final OtherObject? myOnlyProperty;



  @override
  bool operator ==(Object other) => identical(this, other) || other is ExampleResponse &&
     other.myOnlyProperty == myOnlyProperty;

  @override
  int get hashCode =>
    myOnlyProperty.hashCode;

  factory ExampleResponse.fromJson(Map<String, dynamic> json) => _$ExampleResponseFromJson(json);

  Map<String, dynamic> toJson() => _$ExampleResponseToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

