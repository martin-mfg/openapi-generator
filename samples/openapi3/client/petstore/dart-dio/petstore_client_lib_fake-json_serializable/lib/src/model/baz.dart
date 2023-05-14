//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:json_annotation/json_annotation.dart';

part 'baz.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class Baz {
  /// Returns a new [Baz] instance.
  Baz({

     this.innerBaz = 'defaultBaz',
  });

  @JsonKey(
    defaultValue: 'defaultBaz',
    name: r'innerBaz',
    required: false,
    includeIfNull: false
  )


  final String? innerBaz;



  @override
  bool operator ==(Object other) => identical(this, other) || other is Baz &&
     other.innerBaz == innerBaz;

  @override
  int get hashCode =>
    innerBaz.hashCode;

  factory Baz.fromJson(Map<String, dynamic> json) => _$BazFromJson(json);

  Map<String, dynamic> toJson() => _$BazToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

