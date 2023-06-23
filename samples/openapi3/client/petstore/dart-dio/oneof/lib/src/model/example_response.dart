//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'example_response.g.dart';

/// dummy
///
/// Properties:
/// * [emptyString] 
/// * [numberString] 
/// * [boolString] 
/// * [nullString] 
/// * [aBool] 
/// * [zero] 
@BuiltValue()
abstract class ExampleResponse implements Built<ExampleResponse, ExampleResponseBuilder> {
  @BuiltValueField(wireName: r'emptyString')
  String? get emptyString;

  @BuiltValueField(wireName: r'numberString')
  String? get numberString;

  @BuiltValueField(wireName: r'boolString')
  String? get boolString;

  @BuiltValueField(wireName: r'nullString')
  String? get nullString;

  @BuiltValueField(wireName: r'aBool')
  bool? get aBool;

  @BuiltValueField(wireName: r'zero')
  int? get zero;

  ExampleResponse._();

  factory ExampleResponse([void updates(ExampleResponseBuilder b)]) = _$ExampleResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ExampleResponseBuilder b) => b
      ..emptyString = ''
      ..numberString = '42'
      ..boolString = 'false'
      ..nullString = 'null'
      ..aBool = false
      ..zero = 0;

  @BuiltValueSerializer(custom: true)
  static Serializer<ExampleResponse> get serializer => _$ExampleResponseSerializer();
}

class _$ExampleResponseSerializer implements PrimitiveSerializer<ExampleResponse> {
  @override
  final Iterable<Type> types = const [ExampleResponse, _$ExampleResponse];

  @override
  final String wireName = r'ExampleResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ExampleResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.emptyString != null) {
      yield r'emptyString';
      yield serializers.serialize(
        object.emptyString,
        specifiedType: const FullType(String),
      );
    }
    if (object.numberString != null) {
      yield r'numberString';
      yield serializers.serialize(
        object.numberString,
        specifiedType: const FullType(String),
      );
    }
    if (object.boolString != null) {
      yield r'boolString';
      yield serializers.serialize(
        object.boolString,
        specifiedType: const FullType(String),
      );
    }
    if (object.nullString != null) {
      yield r'nullString';
      yield serializers.serialize(
        object.nullString,
        specifiedType: const FullType(String),
      );
    }
    if (object.aBool != null) {
      yield r'aBool';
      yield serializers.serialize(
        object.aBool,
        specifiedType: const FullType(bool),
      );
    }
    if (object.zero != null) {
      yield r'zero';
      yield serializers.serialize(
        object.zero,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ExampleResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ExampleResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'emptyString':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.emptyString = valueDes;
          break;
        case r'numberString':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.numberString = valueDes;
          break;
        case r'boolString':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.boolString = valueDes;
          break;
        case r'nullString':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.nullString = valueDes;
          break;
        case r'aBool':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.aBool = valueDes;
          break;
        case r'zero':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.zero = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ExampleResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ExampleResponseBuilder();
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

