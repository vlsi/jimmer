package org.babyfish.jimmer.client.generator.ts;

public class DynamicWriter extends CodeWriter {

    public static final File FILE = new File("", "Dynamic.ts");

    protected DynamicWriter(Context ctx) {
        super(ctx, FILE);
    }

    @Override
    protected void write() {
        code("export type Dynamic<T> = ");
        scope(ScopeType.OBJECT, "", false, () -> {
            code("{[K in keyof T]?: Dynamic<T[K]>}");
        });
        code(";\n");
    }
}
