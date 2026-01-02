package br.smat.ejb.monitor;
/**
 * Key class for Entity Bean: Monitor
 */
public class MonitorKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int monitor;
	
	/**
	 * Creates an empty key for Entity Bean: Monitor
	 */
	public MonitorKey() {
	}

	public MonitorKey(int monitor) {
		this.monitor = monitor;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.monitor.MonitorKey) {
			br.smat.ejb.monitor.MonitorKey o =
				(br.smat.ejb.monitor.MonitorKey) otherKey;
			return (super.equals(otherKey));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (super.hashCode());
	}
}
