import type { HttpFile } from "../http/http";
import type { Observable } from "../rxjsStub";
import type { Configuration } from "../configuration";



export abstract class AbstractObservableDefaultApi {
    public abstract retrieveSomething(options?: Configuration): Observable<Array<number>>;

}
