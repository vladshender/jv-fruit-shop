package core.basesyntax.service.operation;

import core.basesyntax.db.FruitStorage;
import core.basesyntax.model.FruitTransaction;

public class BalanceOperationHandler implements OperationHandler {

    @Override
    public void process(FruitTransaction transaction, FruitStorage storage) {
        storage.add(transaction.getFruit(), transaction.getQuantity());
    }
}
