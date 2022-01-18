/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_bubble_sort.c                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 12:01:10 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 12:13:29 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

void	swap(char **arr, int i, int j)
{
	char	*swap;

	swap = arr[i];
	arr[i] = arr[j];
	arr[j] = swap;
}

void	sort(char **arr, int l, char (*cmp)(char *, char *))
{
	int	i;
	int	j;
	int	swapped;

	i = 0;
	while (i < l - 1)
	{
		swapped = 0;
		j = 0;
		while (j < l - 1)
		{
			if (cmp(arr[j], arr[j + 1]) > 0)
			{
				swap(arr, j, j + 1);
				swapped = 1;
			}
			j++;
		}
		i++;
		if (!swapped)
			swapped = 0;
	}
}
/*
#include <unistd.h>

void	ft_putstr(char *str)
{
	int	l;

	l = 0;
	while (str[l])
		l++;
	write(1, str, l);
}

char	ft_strcmp(char *s1, char *s2)
{
	int	i;

	i = 0;
	while (s1[i] && s2[i] && s1[i] == s2[i])
		i++;
	return (s1[i] - s2[i]);
}

int	main(int argn, char **args)
{
	int	i;

	sort(&args[1], argn - 1, &ft_strcmp);
	i = 1;
	while (i < argn)
	{
		ft_putstr(args[i++]);
		write(1, "\n", 1);
	}
}
*/
