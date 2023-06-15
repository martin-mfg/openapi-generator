#import "SWGExampleResponse.h"

@implementation SWGExampleResponse

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.emptyString = @"";
    self.numberString = @"42";
    self.boolString = @"false";
    self.nullString = @"null";
    self.aBool = @(NO);
    self.zero = @0;
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"emptyString": @"emptyString", @"numberString": @"numberString", @"boolString": @"boolString", @"nullString": @"nullString", @"aBool": @"aBool", @"zero": @"zero" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"emptyString", @"numberString", @"boolString", @"nullString", @"aBool", @"zero"];
  return [optionalProperties containsObject:propertyName];
}

@end
