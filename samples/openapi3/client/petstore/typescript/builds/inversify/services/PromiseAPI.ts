import type { HttpFile } from "../http/http";
import type { Configuration } from "../configuration";



export abstract class AbstractPromiseDefaultApi {
    public abstract retrieveSomething(options?: Configuration): Promise<number>;

}
