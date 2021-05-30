package by.shyshaliaksey.task5.entity;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

import by.shyshaliaksey.task5.entity.comparator.DeliveryVanByTypeThenIdComparator;

public final class DeliveryVanQueue {

	private static final Queue<DeliveryVan> vansOutsideBase;
	
	private DeliveryVanQueue() {
	}
	
	static {
		vansOutsideBase = new PriorityQueue<>(new DeliveryVanByTypeThenIdComparator());
	}

	public static void add(DeliveryVan deliveryVan) {
		vansOutsideBase.add(deliveryVan);
	}
	
	public static void addAll(Collection<DeliveryVan> collection) {
		vansOutsideBase.addAll(collection);
	}
	
	public static DeliveryVan pool() {
		return vansOutsideBase.poll();
	}
	
	public static boolean isEmpty() {
		return vansOutsideBase.isEmpty();
	}
	
}