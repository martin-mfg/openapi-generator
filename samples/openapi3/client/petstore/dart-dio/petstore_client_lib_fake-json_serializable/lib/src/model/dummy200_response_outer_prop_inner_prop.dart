//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:json_annotation/json_annotation.dart';

part 'dummy200_response_outer_prop_inner_prop.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class Dummy200ResponseOuterPropInnerProp {
  /// Returns a new [Dummy200ResponseOuterPropInnerProp] instance.
  Dummy200ResponseOuterPropInnerProp({

     this.myBool,
  });

  @JsonKey(
    
    name: r'myBool',
    required: false,
    includeIfNull: false
  )


  final bool? myBool;



  @override
  bool operator ==(Object other) => identical(this, other) || other is Dummy200ResponseOuterPropInnerProp &&
     other.myBool == myBool;

  @override
  int get hashCode =>
    myBool.hashCode;

  factory Dummy200ResponseOuterPropInnerProp.fromJson(Map<String, dynamic> json) => _$Dummy200ResponseOuterPropInnerPropFromJson(json);

  Map<String, dynamic> toJson() => _$Dummy200ResponseOuterPropInnerPropToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

