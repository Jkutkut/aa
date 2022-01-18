/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_sort_int_tab.c                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 11:10:55 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 11:11:00 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

void	ft_swap(int *a, int *b)
{
	int	swap;

	swap = *b;
	*b = *a;
	*a = swap;
}

void	ft_sort_int_tab(int *tab, int size)
{
	int	i;
	int	j;
	int	*min;

	i = 0;
	while (i < size)
	{
		j = i + 1;
		min = &tab[i];
		while (j < size)
		{
			if (*min < tab[j])
				min = &tab[j];
			j++;
		}
		ft_swap(&tab[i], min);
		i++;
	}
}
