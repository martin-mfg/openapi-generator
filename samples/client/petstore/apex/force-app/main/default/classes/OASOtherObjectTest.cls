@isTest
private class OASOtherObjectTest {
    @isTest
    private static void equalsSameInstance() {
        OASOtherObject otherObject1 = OASOtherObject.getExample();
        OASOtherObject otherObject2 = otherObject1;
        OASOtherObject otherObject3 = new OASOtherObject();
        OASOtherObject otherObject4 = otherObject3;

        System.assert(otherObject1.equals(otherObject2));
        System.assert(otherObject2.equals(otherObject1));
        System.assert(otherObject1.equals(otherObject1));
        System.assert(otherObject3.equals(otherObject4));
        System.assert(otherObject4.equals(otherObject3));
        System.assert(otherObject3.equals(otherObject3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOtherObject otherObject1 = OASOtherObject.getExample();
        OASOtherObject otherObject2 = OASOtherObject.getExample();
        OASOtherObject otherObject3 = new OASOtherObject();
        OASOtherObject otherObject4 = new OASOtherObject();

        System.assert(otherObject1.equals(otherObject2));
        System.assert(otherObject2.equals(otherObject1));
        System.assert(otherObject3.equals(otherObject4));
        System.assert(otherObject4.equals(otherObject3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOtherObject otherObject1 = OASOtherObject.getExample();
        OASOtherObject otherObject2 = new OASOtherObject();

        System.assertEquals(false, otherObject1.equals('foo'));
        System.assertEquals(false, otherObject2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOtherObject otherObject1 = OASOtherObject.getExample();
        OASOtherObject otherObject2 = new OASOtherObject();
        OASOtherObject otherObject3;

        System.assertEquals(false, otherObject1.equals(otherObject3));
        System.assertEquals(false, otherObject2.equals(otherObject3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOtherObject otherObject1 = OASOtherObject.getExample();
        OASOtherObject otherObject2 = new OASOtherObject();

        System.assertEquals(otherObject1.hashCode(), otherObject1.hashCode());
        System.assertEquals(otherObject2.hashCode(), otherObject2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOtherObject otherObject1 = OASOtherObject.getExample();
        OASOtherObject otherObject2 = OASOtherObject.getExample();
        OASOtherObject otherObject3 = new OASOtherObject();
        OASOtherObject otherObject4 = new OASOtherObject();

        System.assert(otherObject1.equals(otherObject2));
        System.assert(otherObject3.equals(otherObject4));
        System.assertEquals(otherObject1.hashCode(), otherObject2.hashCode());
        System.assertEquals(otherObject3.hashCode(), otherObject4.hashCode());
    }
}
