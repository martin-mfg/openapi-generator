//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Dummy200ResponseOuterPropInnerProp {
  /// Returns a new [Dummy200ResponseOuterPropInnerProp] instance.
  Dummy200ResponseOuterPropInnerProp({
    this.myBool,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? myBool;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Dummy200ResponseOuterPropInnerProp &&
     other.myBool == myBool;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (myBool == null ? 0 : myBool!.hashCode);

  @override
  String toString() => 'Dummy200ResponseOuterPropInnerProp[myBool=$myBool]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.myBool != null) {
      json[r'myBool'] = this.myBool;
    } else {
      json[r'myBool'] = null;
    }
    return json;
  }

  /// Returns a new [Dummy200ResponseOuterPropInnerProp] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Dummy200ResponseOuterPropInnerProp? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Dummy200ResponseOuterPropInnerProp[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Dummy200ResponseOuterPropInnerProp[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Dummy200ResponseOuterPropInnerProp(
        myBool: mapValueOfType<bool>(json, r'myBool'),
      );
    }
    return null;
  }

  static List<Dummy200ResponseOuterPropInnerProp> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Dummy200ResponseOuterPropInnerProp>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Dummy200ResponseOuterPropInnerProp.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Dummy200ResponseOuterPropInnerProp> mapFromJson(dynamic json) {
    final map = <String, Dummy200ResponseOuterPropInnerProp>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Dummy200ResponseOuterPropInnerProp.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Dummy200ResponseOuterPropInnerProp-objects as value to a dart map
  static Map<String, List<Dummy200ResponseOuterPropInnerProp>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Dummy200ResponseOuterPropInnerProp>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Dummy200ResponseOuterPropInnerProp.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

