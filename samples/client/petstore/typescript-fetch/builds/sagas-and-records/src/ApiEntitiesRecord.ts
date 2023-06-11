import {Map, Record, RecordOf} from 'immutable';

import {
} from "./models/index"

export const ApiEntitiesRecordProps = {
    recType: "ApiEntitiesRecord" as "ApiEntitiesRecord",
};

export type ApiEntitiesRecordPropsType = typeof ApiEntitiesRecordProps;
export const ApiEntitiesRecord = Record(ApiEntitiesRecordProps, ApiEntitiesRecordProps.recType);
export type ApiEntitiesRecord = RecordOf<ApiEntitiesRecordPropsType>;
