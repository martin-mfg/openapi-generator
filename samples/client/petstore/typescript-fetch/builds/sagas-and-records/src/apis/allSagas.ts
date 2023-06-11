import {all, fork} from "redux-saga/effects";

import {
    defaultApiAllSagas,
} from "./index";

export function *allApiSagas() {
    yield all([
        fork(defaultApiAllSagas),
    ]);
}
