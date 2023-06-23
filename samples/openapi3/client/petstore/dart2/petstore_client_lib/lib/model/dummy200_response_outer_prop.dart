//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Dummy200ResponseOuterProp {
  /// Returns a new [Dummy200ResponseOuterProp] instance.
  Dummy200ResponseOuterProp({
    this.innerProp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Dummy200ResponseOuterPropInnerProp? innerProp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Dummy200ResponseOuterProp &&
     other.innerProp == innerProp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (innerProp == null ? 0 : innerProp!.hashCode);

  @override
  String toString() => 'Dummy200ResponseOuterProp[innerProp=$innerProp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.innerProp != null) {
      json[r'innerProp'] = this.innerProp;
    } else {
      json[r'innerProp'] = null;
    }
    return json;
  }

  /// Returns a new [Dummy200ResponseOuterProp] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Dummy200ResponseOuterProp? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Dummy200ResponseOuterProp[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Dummy200ResponseOuterProp[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Dummy200ResponseOuterProp(
        innerProp: Dummy200ResponseOuterPropInnerProp.fromJson(json[r'innerProp']),
      );
    }
    return null;
  }

  static List<Dummy200ResponseOuterProp> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Dummy200ResponseOuterProp>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Dummy200ResponseOuterProp.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Dummy200ResponseOuterProp> mapFromJson(dynamic json) {
    final map = <String, Dummy200ResponseOuterProp>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Dummy200ResponseOuterProp.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Dummy200ResponseOuterProp-objects as value to a dart map
  static Map<String, List<Dummy200ResponseOuterProp>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Dummy200ResponseOuterProp>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Dummy200ResponseOuterProp.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

