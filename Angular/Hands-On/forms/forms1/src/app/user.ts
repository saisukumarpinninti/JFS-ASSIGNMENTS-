export class User {
    constructor(
        public name: string,
        public email: string,
        public phone: number,
        public topic: string,
        public time: string,
        public subscribe: boolean
    ) { }
}
