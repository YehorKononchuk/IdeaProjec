package Money;

public class Money {
        private long amount;
        private String currency;

        public Money(double amount, String currency) {
            this.amount = Math.round(amount * 100);
            this.currency = currency;
        }

        @Override
        public String toString() {
            return String.format("%.2f %s", amount / 100.0, currency.toUpperCase());
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Money money)) {
                return false;
            }
            return amount == money.amount && currency.equalsIgnoreString(money.currency);
        }
    }

