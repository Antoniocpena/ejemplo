package chanchinw;

class Sandwich {
    private String pan;
    private String carne;
    private String verdura;

    private Sandwich(Builder builder) {
        this.pan = builder.pan;
        this.carne = builder.carne;
        this.verdura = builder.verdura;
    }

    @Override
    public String toString() {
        return "Sandwich [Pan=" + pan + ", Carne=" + carne + ", Verdura=" + verdura + "]";
    }

    // Builder
    public static class Builder {
        private String pan;
        private String carne;
        private String verdura;

        public Builder setPan(String pan) {
            this.pan = pan;
            return this;
        }

        public Builder setCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public Builder setVerdura(String verdura) {
            this.verdura = verdura;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}

