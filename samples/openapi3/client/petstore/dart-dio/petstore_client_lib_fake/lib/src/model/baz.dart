//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'baz.g.dart';

/// Baz
///
/// Properties:
/// * [innerBaz] 
@BuiltValue()
abstract class Baz implements Built<Baz, BazBuilder> {
  @BuiltValueField(wireName: r'innerBaz')
  String? get innerBaz;

  Baz._();

  factory Baz([void updates(BazBuilder b)]) = _$Baz;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BazBuilder b) => b
      ..innerBaz = 'defaultBaz';

  @BuiltValueSerializer(custom: true)
  static Serializer<Baz> get serializer => _$BazSerializer();
}

class _$BazSerializer implements PrimitiveSerializer<Baz> {
  @override
  final Iterable<Type> types = const [Baz, _$Baz];

  @override
  final String wireName = r'Baz';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Baz object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.innerBaz != null) {
      yield r'innerBaz';
      yield serializers.serialize(
        object.innerBaz,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Baz object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BazBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'innerBaz':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.innerBaz = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Baz deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BazBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

