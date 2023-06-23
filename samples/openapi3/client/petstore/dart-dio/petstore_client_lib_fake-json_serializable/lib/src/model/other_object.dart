//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/example_response.dart';
import 'package:json_annotation/json_annotation.dart';

part 'other_object.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class OtherObject {
  /// Returns a new [OtherObject] instance.
  OtherObject({

     this.myOnlyProperty2,
  });

  @JsonKey(
    
    name: r'myOnlyProperty2',
    required: false,
    includeIfNull: false
  )


  final ExampleResponse? myOnlyProperty2;



  @override
  bool operator ==(Object other) => identical(this, other) || other is OtherObject &&
     other.myOnlyProperty2 == myOnlyProperty2;

  @override
  int get hashCode =>
    myOnlyProperty2.hashCode;

  factory OtherObject.fromJson(Map<String, dynamic> json) => _$OtherObjectFromJson(json);

  Map<String, dynamic> toJson() => _$OtherObjectToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

