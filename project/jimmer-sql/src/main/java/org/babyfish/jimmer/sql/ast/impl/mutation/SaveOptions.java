package org.babyfish.jimmer.sql.ast.impl.mutation;

import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.sql.ast.mutation.SaveMode;
import org.babyfish.jimmer.sql.event.Triggers;
import org.babyfish.jimmer.sql.runtime.JSqlClientImplementor;

import java.util.Set;

public interface SaveOptions {

    JSqlClientImplementor getSqlClient();

    SaveMode getMode();

    Triggers getTriggers();

    Set<ImmutableProp> getKeyProps(ImmutableType type);
}