import {all, fork} from "redux-saga/effects";

import {
    defaultApiAllSagas,
} from "./";

export function *allApiSagas() {
    yield all([
        fork(defaultApiAllSagas),
    ]);
}
