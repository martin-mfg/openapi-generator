@isTest
private class OASDummy200ResponseOuterPropInnerProTest {
    @isTest
    private static void equalsSameInstance() {
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp1 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp2 = dummy200ResponseOuterPropInnerProp1;
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp3 = new OASDummy200ResponseOuterPropInnerPro();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp4 = dummy200ResponseOuterPropInnerProp3;

        System.assert(dummy200ResponseOuterPropInnerProp1.equals(dummy200ResponseOuterPropInnerProp2));
        System.assert(dummy200ResponseOuterPropInnerProp2.equals(dummy200ResponseOuterPropInnerProp1));
        System.assert(dummy200ResponseOuterPropInnerProp1.equals(dummy200ResponseOuterPropInnerProp1));
        System.assert(dummy200ResponseOuterPropInnerProp3.equals(dummy200ResponseOuterPropInnerProp4));
        System.assert(dummy200ResponseOuterPropInnerProp4.equals(dummy200ResponseOuterPropInnerProp3));
        System.assert(dummy200ResponseOuterPropInnerProp3.equals(dummy200ResponseOuterPropInnerProp3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp1 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp2 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp3 = new OASDummy200ResponseOuterPropInnerPro();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp4 = new OASDummy200ResponseOuterPropInnerPro();

        System.assert(dummy200ResponseOuterPropInnerProp1.equals(dummy200ResponseOuterPropInnerProp2));
        System.assert(dummy200ResponseOuterPropInnerProp2.equals(dummy200ResponseOuterPropInnerProp1));
        System.assert(dummy200ResponseOuterPropInnerProp3.equals(dummy200ResponseOuterPropInnerProp4));
        System.assert(dummy200ResponseOuterPropInnerProp4.equals(dummy200ResponseOuterPropInnerProp3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp1 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp2 = new OASDummy200ResponseOuterPropInnerPro();

        System.assertEquals(false, dummy200ResponseOuterPropInnerProp1.equals('foo'));
        System.assertEquals(false, dummy200ResponseOuterPropInnerProp2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp1 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp2 = new OASDummy200ResponseOuterPropInnerPro();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp3;

        System.assertEquals(false, dummy200ResponseOuterPropInnerProp1.equals(dummy200ResponseOuterPropInnerProp3));
        System.assertEquals(false, dummy200ResponseOuterPropInnerProp2.equals(dummy200ResponseOuterPropInnerProp3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp1 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp2 = new OASDummy200ResponseOuterPropInnerPro();

        System.assertEquals(dummy200ResponseOuterPropInnerProp1.hashCode(), dummy200ResponseOuterPropInnerProp1.hashCode());
        System.assertEquals(dummy200ResponseOuterPropInnerProp2.hashCode(), dummy200ResponseOuterPropInnerProp2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp1 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp2 = OASDummy200ResponseOuterPropInnerPro.getExample();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp3 = new OASDummy200ResponseOuterPropInnerPro();
        OASDummy200ResponseOuterPropInnerPro dummy200ResponseOuterPropInnerProp4 = new OASDummy200ResponseOuterPropInnerPro();

        System.assert(dummy200ResponseOuterPropInnerProp1.equals(dummy200ResponseOuterPropInnerProp2));
        System.assert(dummy200ResponseOuterPropInnerProp3.equals(dummy200ResponseOuterPropInnerProp4));
        System.assertEquals(dummy200ResponseOuterPropInnerProp1.hashCode(), dummy200ResponseOuterPropInnerProp2.hashCode());
        System.assertEquals(dummy200ResponseOuterPropInnerProp3.hashCode(), dummy200ResponseOuterPropInnerProp4.hashCode());
    }
}
