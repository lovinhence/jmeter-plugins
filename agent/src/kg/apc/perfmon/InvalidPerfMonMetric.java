package kg.apc.perfmon;

/**
 *
 * @author undera
 */
class InvalidPerfMonMetric extends AbstractPerfMonMetric {

    public InvalidPerfMonMetric() {
        super(null);
    }

    public void getValue(StringBuilder res) {
        res.append('0');
    }
}