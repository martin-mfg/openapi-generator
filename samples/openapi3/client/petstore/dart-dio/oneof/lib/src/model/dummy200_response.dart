//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/dummy200_response_outer_prop.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dummy200_response.g.dart';

/// Dummy200Response
///
/// Properties:
/// * [outerProp] 
@BuiltValue()
abstract class Dummy200Response implements Built<Dummy200Response, Dummy200ResponseBuilder> {
  @BuiltValueField(wireName: r'outerProp')
  Dummy200ResponseOuterProp? get outerProp;

  Dummy200Response._();

  factory Dummy200Response([void updates(Dummy200ResponseBuilder b)]) = _$Dummy200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(Dummy200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Dummy200Response> get serializer => _$Dummy200ResponseSerializer();
}

class _$Dummy200ResponseSerializer implements PrimitiveSerializer<Dummy200Response> {
  @override
  final Iterable<Type> types = const [Dummy200Response, _$Dummy200Response];

  @override
  final String wireName = r'Dummy200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Dummy200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.outerProp != null) {
      yield r'outerProp';
      yield serializers.serialize(
        object.outerProp,
        specifiedType: const FullType(Dummy200ResponseOuterProp),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Dummy200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required Dummy200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'outerProp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Dummy200ResponseOuterProp),
          ) as Dummy200ResponseOuterProp;
          result.outerProp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Dummy200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = Dummy200ResponseBuilder();
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

