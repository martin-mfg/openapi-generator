@isTest
private class OASDummy200ResponseOuterPropTest {
    @isTest
    private static void equalsSameInstance() {
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp1 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp2 = dummy200ResponseOuterProp1;
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp3 = new OASDummy200ResponseOuterProp();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp4 = dummy200ResponseOuterProp3;

        System.assert(dummy200ResponseOuterProp1.equals(dummy200ResponseOuterProp2));
        System.assert(dummy200ResponseOuterProp2.equals(dummy200ResponseOuterProp1));
        System.assert(dummy200ResponseOuterProp1.equals(dummy200ResponseOuterProp1));
        System.assert(dummy200ResponseOuterProp3.equals(dummy200ResponseOuterProp4));
        System.assert(dummy200ResponseOuterProp4.equals(dummy200ResponseOuterProp3));
        System.assert(dummy200ResponseOuterProp3.equals(dummy200ResponseOuterProp3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp1 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp2 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp3 = new OASDummy200ResponseOuterProp();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp4 = new OASDummy200ResponseOuterProp();

        System.assert(dummy200ResponseOuterProp1.equals(dummy200ResponseOuterProp2));
        System.assert(dummy200ResponseOuterProp2.equals(dummy200ResponseOuterProp1));
        System.assert(dummy200ResponseOuterProp3.equals(dummy200ResponseOuterProp4));
        System.assert(dummy200ResponseOuterProp4.equals(dummy200ResponseOuterProp3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp1 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp2 = new OASDummy200ResponseOuterProp();

        System.assertEquals(false, dummy200ResponseOuterProp1.equals('foo'));
        System.assertEquals(false, dummy200ResponseOuterProp2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp1 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp2 = new OASDummy200ResponseOuterProp();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp3;

        System.assertEquals(false, dummy200ResponseOuterProp1.equals(dummy200ResponseOuterProp3));
        System.assertEquals(false, dummy200ResponseOuterProp2.equals(dummy200ResponseOuterProp3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp1 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp2 = new OASDummy200ResponseOuterProp();

        System.assertEquals(dummy200ResponseOuterProp1.hashCode(), dummy200ResponseOuterProp1.hashCode());
        System.assertEquals(dummy200ResponseOuterProp2.hashCode(), dummy200ResponseOuterProp2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp1 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp2 = OASDummy200ResponseOuterProp.getExample();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp3 = new OASDummy200ResponseOuterProp();
        OASDummy200ResponseOuterProp dummy200ResponseOuterProp4 = new OASDummy200ResponseOuterProp();

        System.assert(dummy200ResponseOuterProp1.equals(dummy200ResponseOuterProp2));
        System.assert(dummy200ResponseOuterProp3.equals(dummy200ResponseOuterProp4));
        System.assertEquals(dummy200ResponseOuterProp1.hashCode(), dummy200ResponseOuterProp2.hashCode());
        System.assertEquals(dummy200ResponseOuterProp3.hashCode(), dummy200ResponseOuterProp4.hashCode());
    }
}
